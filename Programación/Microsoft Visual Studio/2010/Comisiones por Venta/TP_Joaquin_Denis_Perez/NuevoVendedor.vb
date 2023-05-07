Public Class NuevoVendedor

    Private Sub txtVendedor_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtVendedor.KeyPress
        'Solo se registran números en la Textbox
        If Char.IsNumber(e.KeyChar) Then
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
    End Sub

    Private Sub txtNombreVendedor_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtNombreVendedor.KeyPress
        'Solo se registran letras en la Textbox
        If Char.IsLetter(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True
            'Solo se registran controles en la Textbox
            If Char.IsControl(e.KeyChar) Then
                e.Handled = False
            Else
                e.Handled = True
                'Solo se registran espacios en blanco en la Textbox
                If Char.IsWhiteSpace(e.KeyChar) Then
                    e.Handled = False
                Else
                    e.Handled = True
                End If
            End If
        End If
    End Sub

    Private Sub txtComision_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtComision.KeyPress
        'Solo se registran números en la Textbox
        If Char.IsNumber(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True
            'Solo se registran controles en la Textbox
            If Char.IsControl(e.KeyChar) Then
                e.Handled = False
            Else
                e.Handled = True
                'Solo se registran signos de puntuación en la Textbox
                If Char.IsPunctuation(e.KeyChar) Then
                    e.Handled = False
                Else
                    e.Handled = True
                End If
            End If
        End If
    End Sub

    Private Sub btnAceptar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAceptar.Click

        'El registro en las Textboxs no ingresado enviará un mensaje de error
        If txtVendedor.Text = "" Then
            MessageBox.Show("FALTA INGRESAR NÚMERO DEL VENDEDOR", "INGRESO NUEVO VENDEDOR")
            Return 'retorna a la textbox para ingresar el dato faltante
        Else
            If txtNombreVendedor.Text = "" Then
                MessageBox.Show("FALTA INGRESAR EL NOMBRE DEL VENDEDOR", "INGRESO NUEVO VENDEDOR")
                Return
            Else
                If txtComision.Text = "" Then
                    MessageBox.Show("FALTA INGRESAR LA COMISION DEL VENDEDOR", "INGRESO NUEVO VENDEDOR")
                    Return
                End If
            End If
        End If

        'Ingreso de un bucle que verifique los datos ingresados en la variable i
        For i As Integer = 0 To VVendedor.Length - 1 'Busca hasta el ultimo registro que se ingresó

            If VVendedor(i).vendedor = txtVendedor.Text Then
                MessageBox.Show("YA SE REGISTRÓ EL NÚMERO DEL VENDEDOR", "INGRESO NUEVO VENDEDOR")
                Return
            Else
                'Ingreso de vendedores hasta 10 registros
                If IV > 9 Then
                    MessageBox.Show("REGISTRO COMPLETO", "INGRESO NUEVO VENDEDOR")
                    Exit For
                Else
                    'Ingreso de los datos en el array
                    VVendedor(IV).vendedor = Val(txtVendedor.Text)
                    VVendedor(IV).nombre = txtNombreVendedor.Text
                    VVendedor(IV).comision = Val(txtComision.Text)
                    MessageBox.Show("REGISTRO CON EXITO", "INGRESO NUEVO VENDEDOR")
                    IV += 1
                    Exit For
                End If
            End If
        Next
        'Una vez registrado se eliminan el contenido de las Textboxs para generar un nuevo ingreso
        txtVendedor.Text = ""
        txtNombreVendedor.Text = ""
        txtComision.Text = ""

    End Sub
End Class