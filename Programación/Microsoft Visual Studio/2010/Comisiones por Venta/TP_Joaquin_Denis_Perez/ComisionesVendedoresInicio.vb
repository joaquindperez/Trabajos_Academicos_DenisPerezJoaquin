Public Class ComisionesVendedoresInicio


    Private Sub NuevoVendedorToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NuevoVendedorToolStripMenuItem.Click
        NuevoVendedor.ShowDialog()
    End Sub

    Private Sub NuevaFacturaToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NuevaFacturaToolStripMenuItem.Click
        NuevaFactura.ShowDialog()
    End Sub

    Private Sub ComisionesPorVentaToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ComisionesPorVentaToolStripMenuItem.Click
        Comiciones.ShowDialog()
    End Sub

    Private Sub SalirToolStripMenuItem_Click(sender As System.Object, e As System.EventArgs) Handles SalirToolStripMenuItem.Click
        Me.Close()
    End Sub
End Class
