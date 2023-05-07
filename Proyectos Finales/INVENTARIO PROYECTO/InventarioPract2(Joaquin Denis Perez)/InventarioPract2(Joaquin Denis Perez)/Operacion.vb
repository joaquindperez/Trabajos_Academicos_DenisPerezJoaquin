Imports System.Data.SqlClient
Imports System.Data
Imports System.Windows.Forms
Imports MySql.Data.MySqlClient
Public Class Operacion
    Dim cnn As New MySqlConnection("" +
            "server=localhost; user id=root;password=ramon2001;" +
            "database=inventario;sslMode=none")

    Dim cmd As New MySqlCommand
    Dim adapter As New MySqlDataAdapter
    Dim tbl As New DataTable
    Dim sql As String
    Dim result As Integer
    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
        Dim m As New Menu
        m.Show()
    End Sub

    Private Sub btnAñadir_Click(sender As Object, e As EventArgs) Handles btnAñadir.Click

        Try
            cnn.Open()
            cmd = New MySqlCommand()
            cmd.Connection = cnn
            sql = "INSERT INTO inventario.repuestos (ID, Descrip, Ubicac, Precio) VALUES
            (('" + txtID.Text + " '), ('" + txtDescrip.Text + " '),
            ('" + txtUbica.Text + " '), ('" + txtPrecio.Text + " '))"

            cmd.CommandText = sql
            result = cmd.ExecuteNonQuery()

            If result > 0 Then
                MessageBox.Show("Guardado con Éxito", "GUARDADO")
            End If

        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
        cnn.Close()


    End Sub

    Private Sub btnCargar_Click(sender As Object, e As EventArgs) Handles btnCargar.Click
        Try
            sql = "SELECT * FROM inventario.repuestos"
            cnn.Open()
            cmd = New MySqlCommand()
            cmd.Connection = cnn
            cmd.CommandText = sql
            adapter = New MySqlDataAdapter()
            adapter.SelectCommand = cmd
            tbl = New DataTable()
            adapter.Fill(tbl)
            DataGridView1.DataSource = tbl
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
        cnn.Close()
        adapter.Dispose()
    End Sub

    Private Sub txtID_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtID.KeyPress
        If Not Char.IsDigit(e.KeyChar) And e.KeyChar <> vbBack Then
            e.Handled = True
        End If
    End Sub
    Private Sub txtUbica_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtUbica.KeyPress
        If Not Char.IsDigit(e.KeyChar) And e.KeyChar <> vbBack Then
            e.Handled = True
        End If
    End Sub

    Private Sub Operacion_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim precio As Integer
        txtPrecio.Text = precio.ToString("C")
    End Sub
End Class