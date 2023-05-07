<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ComisionesVendedoresInicio
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.TareasToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.NuevoVendedorToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.NuevaFacturaToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ComisionesPorVentaToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.SalirToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.TareasToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(497, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'TareasToolStripMenuItem
        '
        Me.TareasToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.NuevoVendedorToolStripMenuItem, Me.NuevaFacturaToolStripMenuItem, Me.ComisionesPorVentaToolStripMenuItem, Me.SalirToolStripMenuItem})
        Me.TareasToolStripMenuItem.Name = "TareasToolStripMenuItem"
        Me.TareasToolStripMenuItem.Size = New System.Drawing.Size(51, 20)
        Me.TareasToolStripMenuItem.Text = "Tareas"
        '
        'NuevoVendedorToolStripMenuItem
        '
        Me.NuevoVendedorToolStripMenuItem.Name = "NuevoVendedorToolStripMenuItem"
        Me.NuevoVendedorToolStripMenuItem.Size = New System.Drawing.Size(189, 22)
        Me.NuevoVendedorToolStripMenuItem.Text = "Nuevo Vendedor"
        '
        'NuevaFacturaToolStripMenuItem
        '
        Me.NuevaFacturaToolStripMenuItem.Name = "NuevaFacturaToolStripMenuItem"
        Me.NuevaFacturaToolStripMenuItem.Size = New System.Drawing.Size(189, 22)
        Me.NuevaFacturaToolStripMenuItem.Text = "Nueva Factura"
        '
        'ComisionesPorVentaToolStripMenuItem
        '
        Me.ComisionesPorVentaToolStripMenuItem.Name = "ComisionesPorVentaToolStripMenuItem"
        Me.ComisionesPorVentaToolStripMenuItem.Size = New System.Drawing.Size(189, 22)
        Me.ComisionesPorVentaToolStripMenuItem.Text = "Comisiones por Venta"
        '
        'SalirToolStripMenuItem
        '
        Me.SalirToolStripMenuItem.Name = "SalirToolStripMenuItem"
        Me.SalirToolStripMenuItem.Size = New System.Drawing.Size(189, 22)
        Me.SalirToolStripMenuItem.Text = "Salir"
        '
        'ComisionesVendedores
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(497, 261)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "ComisionesVendedores"
        Me.Text = "Comisiones Vendedores"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents TareasToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents NuevoVendedorToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents NuevaFacturaToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ComisionesPorVentaToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents SalirToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem

End Class
