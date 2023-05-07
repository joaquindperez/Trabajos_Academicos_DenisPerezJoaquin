Public Class Formulario

    Dim fechaActual As DateTime = Date.Now
    Dim fechaegreso As TimeSpan
    Dim patente As String
    Dim piso As Integer
    Dim cochera As Integer
    Dim coches(249) As Vehiculos 'array
    Dim posicion As Integer

    Private Sub btnSalir_Click(sender As System.Object, e As System.EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    Private Sub Formulario_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        'declarar items en combobox pisos
        cmbPisos.Items.Add("1")
        cmbPisos.Items.Add("2")
        cmbPisos.Items.Add("3")
        cmbPisos.Items.Add("4")
        cmbPisos.Items.Add("5")
        'Ingresar 250 items en listbox cocheras
        For i As Integer = 1 To 250 Step 1
            lstCocheras.Items.Add(i)
        Next
    End Sub

    Private Sub txtPatente_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtPatente.TextChanged
        'registro de patente, numero de pisos y numero de cochera para habilitar el ingreso
        If txtPatente.Text <> "" And cmbPisos.SelectedIndex > -1 And lstCocheras.SelectedIndex > -1 Then
            btnIngresar.Enabled = True
        Else
            btnIngresar.Enabled = False
        End If

        If txtPatente.Text <> "" Then
            btnBuscar.Enabled = True
        Else
            btnBuscar.Enabled = False
        End If
    End Sub

    Private Sub cmbPisos_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles cmbPisos.SelectedIndexChanged
        'registro de patente, numero de pisos y numero de cochera para habilitar el ingreso
        If txtPatente.Text <> "" And cmbPisos.SelectedIndex > -1 And lstCocheras.SelectedIndex > -1 Then
            btnIngresar.Enabled = True
        Else
            btnIngresar.Enabled = False
        End If
    End Sub

    Private Sub lstCocheras_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lstCocheras.SelectedIndexChanged
        'registro de patente, numero de pisos y numero de cochera para habilitar el ingreso
        If txtPatente.Text <> "" And cmbPisos.SelectedIndex > -1 And lstCocheras.SelectedIndex > -1 Then
            btnIngresar.Enabled = True
        Else
            btnIngresar.Enabled = False
        End If
    End Sub

    Private Sub btnIngresar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnIngresar.Click
        'declarar variables para obtener el ingreso y selección de cada control
        patente = txtPatente.Text
        piso = cmbPisos.SelectedItem
        cochera = lstCocheras.SelectedItem

        'registro de fecha y hora actual en textbox
        lblIngresa.Text = (DateTime.Now)

        'registro de cochera y piso en textbox
        lblUbicacion.Text = "Cochera " & cochera & " Piso " & piso

        'almacen de registros
        For i As Integer = 0 To coches.Length - 1 ' bucle para que cuente cada dimension del array
            If coches(i).patente = txtPatente.Text Then
                MessageBox.Show("YA SE ENCUENTRA LA PATENTE INGRESADA", "INGRESO DEL AUTO")
                Exit For
            Else
                If coches(i).cochera = lstCocheras.SelectedItem Then
                    MessageBox.Show("YA SE ENCUENTRA LA COCHERA INGRESADA", "INGRESO DEL AUTO")
                    Exit For
                Else
                    'buscar lo que se ingresó en la caja de texto en el array 
                    coches(i).patente = txtPatente.Text
                    coches(i).piso = cmbPisos.SelectedItem
                    coches(i).cochera = lstCocheras.SelectedItem
                    coches(i).fechaActual = Date.Now
                    MessageBox.Show("REGISTRO DEL VEHÍCULO CON EXITO", "INGRESO DEL AUTO")
                    Exit For
                End If
            End If
        Next

    End Sub

    Private Sub txtAbona_KeyPress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtAbona.KeyPress

        'se hablita solo numeros, puntuaciones y controles (backspace)
        If Char.IsNumber(e.KeyChar) Then
            e.Handled = False
        Else
            e.Handled = True

            If Char.IsControl(e.KeyChar) Then
                e.Handled = False
            Else
                e.Handled = True

                If Char.IsPunctuation(e.KeyChar) Then
                    e.Handled = False
                Else
                    e.Handled = True

                End If
            End If
        End If
    End Sub

    Private Sub txtPatente_Keypress(ByVal sender As System.Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtPatente.KeyPress

        If Char.IsPunctuation(e.KeyChar) Then
            e.Handled = True
        Else
            e.Handled = False

        End If
    End Sub

    Private Sub btnBuscar_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnBuscar.Click

        Dim fechaEgresa As DateTime = Date.Now
        Dim existe As Boolean = False
        Dim minutos As TimeSpan 'declarar variable para calcular minutos
        Dim patente As String = txtPatente.Text
        Const PrecioxMinuto As Integer = 2

        'almacen de registros
        For i As Integer = 0 To coches.Length - 1
            If coches(i).patente = txtPatente.Text Then 'verifica si existe la patente ingresada
                existe = True
                posicion = i 'declara variable posicion como variable i del bucle
                btnEgresar.Enabled = True
                Exit For
            Else
                existe = False
                btnEgresar.Enabled = False
                MessageBox.Show("LA PATENTE NO ESTÁ REGISTRADA", "BÚSQUEDA DE AUTO")
                Exit For
            End If
        Next
        If existe Then
            'registro de fecha y hora actual en textbox
            lblIngresa.Text = coches(posicion).fechaActual
            'registro de cochera y piso en textbox
            lblUbicacion.Text = "Cochera " & coches(posicion).cochera & " Piso " & coches(posicion).piso
            'registro de fecha y hora actual en textbox
            lblEgresa.Text = fechaEgresa
            'registro importe
            minutos = fechaEgresa.Subtract(coches(posicion).fechaActual)
            lblImporte.Text = minutos.Minutes * PrecioxMinuto
            txtAbona.Enabled = True 'habilita textbox abono 
        End If
    End Sub

    Private Sub btnEgresar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnEgresar.Click

        Dim total As Integer
        Dim abono As Single
        Dim vuelto As Single

        total = CInt(lblImporte.Text) 'registro de la text box importe y pasar su valor a entero

        abono = txtAbona.Text 'caja de texto abono
        If abono >= total Then
            vuelto = abono - total
            lblVuelto.Text = vuelto
            coches(posicion).patente = txtPatente.Text
        End If

        txtPatente.Text = ""
        lblUbicacion.Text = ""
        lblIngresa.Text = ""
        lblEgresa.Text = ""
        btnEgresar.Enabled = False
        txtAbona.Enabled = False

    End Sub
End Class
