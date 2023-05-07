Public Class NuevaFactura

    Private Sub txtFactura_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtFactura.KeyPress
        'Solo se registran numeros en la Textbox
        If Char.IsNumber(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True
            'Solo se registran puntuaciones en la Textbox
            If Char.IsPunctuation(e.KeyChar) Then
                e.Handled = False
            Else
                e.Handled = True
                'Solo se registran controles en la Textbox
                If Char.IsControl(e.KeyChar) Then
                    e.Handled = False
                Else
                    e.Handled = True
                End If
            End If
        End If
    End Sub

    Private Sub txtImporte_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtImporte.KeyPress
        'Solo se regitran numeros en la Textbox
        If Char.IsNumber(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True
            'Solo se registran puntuaciones en la Textbox
            If Char.IsPunctuation(e.KeyChar) Then
                e.Handled = False
            Else
                e.Handled = True
                'Solo se registran controles en la Textbox
                If Char.IsControl(e.KeyChar) Then
                    e.Handled = False
                Else
                    e.Handled = True
                End If
            End If
        End If
    End Sub

    Private Sub NuevaFactura_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        'ingreso de variable para buscar dentro del array lo deseado
        Dim i As Integer = 0

        CbVendedor.Items.Clear() ' evitar duplicar el registro
        While i < IV

            CbVendedor.Items.Add(VVendedor(i).vendedor) 'ingresa los nombres ingresados de Nuevo Vendedor a la combobox
            i += 1
        End While

    End Sub

    Private Sub btnAceptar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAceptar.Click
        'mensaje de error ante un dato no ingresado
        If txtFactura.Text = "" Then
            MessageBox.Show("FALTA INGRESAR NÚMERO DE FACTURA", "INGRESO NUEVA FACTURA")
            Return
        Else
            If CbVendedor.SelectedIndex = -1 Then 'Si no se selecciona un item de la combobox
                MessageBox.Show("FALTA SELECCIONAR EL VENDEDOR", "INGRESO NUEVA FACTURA")
                Return
            Else
                If txtImporte.Text = "" Then
                    MessageBox.Show("FALTA INGRESAR NÚMERO DE IMPORTE", "INGRESO NUEVA FACTURA")
                    Return
                End If
            End If
        End If
        'Ingreso de un bucle que verifique los datos ingresados en la variable i
        For j As Integer = 0 To VFactura.Length - 1 'Busca hasta el ultimo registro que se ingresó
            If VFactura(j).factura = txtFactura.Text Then
                MessageBox.Show("YA SE REGISTRÓ EL NÚMERO DE FACTURA", "INGRESO NUEVA FACTURA")
                Return
            Else
                'Ingreso de facturas hasta 100 registros
                If IFAC > 99 Then
                    MessageBox.Show("REGISTRO COMPLETO", "INGRESO NUEVA FACTURA")
                    Exit For
                Else
                    j = 0
                    'se busca el número de vendedor
                    Do While j < IV
                        If VVendedor(j).vendedor = CbVendedor.Text Then
                            Exit Do
                        End If
                        j = j + 1

                    Loop
                    'Ingreso de datos en el array
                    VFactura(IFAC).factura = Val(txtFactura.Text)
                    VFactura(IFAC).fecha = DatetimeFecha.Text
                    VFactura(IFAC).vendedorFactura = VVendedor(j).vendedor
                    VFactura(IFAC).importe = Val(txtImporte.Text)
                    MessageBox.Show("REGISTRO CON EXITO", "INGRESO NUEVA FACTURA")
                    IFAC = IFAC + 1
                    Exit For
                End If
            End If
        Next
        'Elimina todos los datos ingresados en las textboxs
        txtFactura.Text = ""
        txtImporte.Text = ""
        CbVendedor.SelectedIndex = -1 'quitar valor seleccionado en combobox
        txtFactura.Focus()
    End Sub
End Class