Imports System.Data.SqlClient
Imports System.Data
Imports System.Windows.Forms
Imports MySql.Data.MySqlClient
Public Class Proveedores
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

    Private Sub Proveedores_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        cmbProveedor.Items.Add("BM Repuestos")
        cmbProveedor.Items.Add("MERCOMAX")
        'cmbDispo.Items.Add("Stock")
        'cmbDispo.Items.Add("No Disponible")
    End Sub

    Private Sub btnCargar_Click(sender As Object, e As EventArgs) Handles btnCargar.Click
        If cmbProveedor.SelectedItem = "BM Repuestos" Then
            Try
                sql = "SELECT * FROM inventario.bmrepuestos"
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
        End If
        If cmbProveedor.SelectedItem = "MERCOMAX" Then
            Try
                sql = "SELECT * FROM inventario.mercomax"
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
        End If
        'If cmbDispo.SelectedItem = "Stock" And cmbProveedor.SelectedItem = "BM Repuestos" Then
        '    Try
        '        sql = "SELECT * FROM inventario.bmrepuestos WHERE Dispo = 'Stock'"
        '        cnn.Open()
        '        cmd = New MySqlCommand()
        '        cmd.Connection = cnn
        '        cmd.CommandText = sql
        '        adapter = New MySqlDataAdapter()
        '        adapter.SelectCommand = cmd
        '        tbl = New DataTable()
        '        adapter.Fill(tbl)
        '        DataGridView1.DataSource = tbl
        '    Catch ex As Exception
        '        MessageBox.Show(ex.Message)
        '    End Try
        'End If
        'If cmbDispo.SelectedItem = "No Disponible" And cmbProveedor.SelectedItem = "BM Repuestos" Then
        '    Try
        '        sql = "SELECT * FROM inventario.bmrepuestos WHERE Dispo = 'No Disponible'"
        '        cnn.Open()
        '        cmd = New MySqlCommand()
        '        cmd.Connection = cnn
        '        cmd.CommandText = sql
        '        adapter = New MySqlDataAdapter()
        '        adapter.SelectCommand = cmd
        '        tbl = New DataTable()
        '        adapter.Fill(tbl)
        '        DataGridView1.DataSource = tbl
        '    Catch ex As Exception
        '        MessageBox.Show(ex.Message)
        '    End Try
        'End If
        'If cmbDispo.SelectedItem = "Stock" And cmbProveedor.SelectedItem = "MERCOMAX" Then
        '    Try
        '        sql = "SELECT * FROM inventario.mercomax WHERE Dispo = 'Stock'"
        '        cnn.Open()
        '        cmd = New MySqlCommand()
        '        cmd.Connection = cnn
        '        cmd.CommandText = sql
        '        adapter = New MySqlDataAdapter()
        '        adapter.SelectCommand = cmd
        '        tbl = New DataTable()
        '        adapter.Fill(tbl)
        '        DataGridView1.DataSource = tbl
        '    Catch ex As Exception
        '        MessageBox.Show(ex.Message)
        '    End Try
        'End If
        'If cmbDispo.SelectedItem = "No Disponible" And cmbProveedor.SelectedItem = "MERCOMAX" Then
        '    Try
        '        sql = "SELECT * FROM inventario.mercomax WHERE Dispo = 'No Disponible'"
        '        cnn.Open()
        '        cmd = New MySqlCommand()
        '        cmd.Connection = cnn
        '        cmd.CommandText = sql
        '        adapter = New MySqlDataAdapter()
        '        adapter.SelectCommand = cmd
        '        tbl = New DataTable()
        '        adapter.Fill(tbl)
        '        DataGridView1.DataSource = tbl
        '    Catch ex As Exception
        '        MessageBox.Show(ex.Message)
        '    End Try
        'End If
        cnn.Close()
        adapter.Dispose()

    End Sub
End Class