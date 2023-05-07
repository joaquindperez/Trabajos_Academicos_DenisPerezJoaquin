Public Class Menu
    Private Sub Menu_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub UbicaciónYPrecioToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles UbicaciónYPrecioToolStripMenuItem.Click
        Dim up As New UbicacPrecio
        up.Show()
        Me.Hide()
    End Sub

    Private Sub ProveedoresToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles StockToolStripMenuItem.Click
        Dim p As New Proveedores
        p.Show()
        Me.Hide()
    End Sub

    Private Sub SalirToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SalirToolStripMenuItem.Click
        Me.Close()
        End 'Salir del programa
    End Sub

    Private Sub AñadirRepuestoToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AñadirRepuestoToolStripMenuItem.Click
        Dim o1 As New Operacion
        o1.Show()
        Me.Hide()
    End Sub

    Private Sub EliminarRepuestoToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles EliminarRepuestoToolStripMenuItem.Click
        Dim o2 As New Operacion2
        o2.Show()
        Me.Hide()
    End Sub

    Private Sub ModificarToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ModificarToolStripMenuItem.Click

    End Sub
End Class