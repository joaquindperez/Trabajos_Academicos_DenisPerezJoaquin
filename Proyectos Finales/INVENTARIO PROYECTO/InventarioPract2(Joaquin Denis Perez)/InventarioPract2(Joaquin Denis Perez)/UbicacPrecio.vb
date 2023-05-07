Imports System.Data.SqlClient
Imports System.Data
Imports System.Windows.Forms
Imports MySql.Data.MySqlClient
Public Class UbicacPrecio
    Dim cnn As New MySqlConnection("" +
           "server=localhost; user id=root;password=ramon2001;" +
           "database=inventario;sslMode=none")

    Dim cmd As New MySqlCommand
    Dim adapter As New MySqlDataAdapter
    Dim tbl As New DataTable
    Dim sql As String
    Private Sub UbicacPrecio_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub btnCargar_Click(sender As Object, e As EventArgs) Handles btnCargar.Click
        Try
            sql = "SELECT * FROM inventario.repuestos WHERE ID = ('" + txtID.Text + " ') OR 
            Ubicac = ('" + txtUbi.Text + "')"

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

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
        Dim m As New Menu
        m.Show()
    End Sub

    Private Sub txtNom_TextChanged(sender As Object, e As EventArgs) Handles txtNom.TextChanged

        sql = "SELECT * FROM inventario.repuestos WHERE Descrip Like ('" + txtNom.Text + "%')"
        If txtNom.Text = "" Then
            DataGridView1.Visible = False
        Else
            DataGridView1.Visible = True
        End If
        cnn.Open()
            cmd = New MySqlCommand()
            cmd.Connection = cnn
            cmd.CommandText = sql
            adapter = New MySqlDataAdapter()
            adapter.SelectCommand = cmd
            tbl = New DataTable()
            adapter.Fill(tbl)
            DataGridView1.DataSource = tbl
            cnn.Close()
            adapter.Dispose()

    End Sub
    Private Sub txtID_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtID.KeyPress
        If Not Char.IsDigit(e.KeyChar) And e.KeyChar <> vbBack Then
            e.Handled = True
        End If
    End Sub
    Private Sub txtUbi_KeyPress(ByVal sender As Object, ByVal e As System.Windows.Forms.KeyPressEventArgs) Handles txtUbi.KeyPress
        If Not Char.IsDigit(e.KeyChar) And e.KeyChar <> vbBack Then
            e.Handled = True
        End If
    End Sub
End Class