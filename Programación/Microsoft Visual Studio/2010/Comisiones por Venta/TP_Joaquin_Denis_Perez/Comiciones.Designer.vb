<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Comiciones
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
        Me.Grilla = New System.Windows.Forms.DataGridView()
        Me.ColumnNombre = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.ColumnVentas = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.ColumnComision = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.ColumnImporte = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.btnSalir = New System.Windows.Forms.Button()
        CType(Me.Grilla, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Grilla
        '
        Me.Grilla.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.Grilla.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.ColumnNombre, Me.ColumnVentas, Me.ColumnComision, Me.ColumnImporte})
        Me.Grilla.Location = New System.Drawing.Point(12, 12)
        Me.Grilla.Name = "Grilla"
        Me.Grilla.Size = New System.Drawing.Size(468, 264)
        Me.Grilla.TabIndex = 0
        '
        'ColumnNombre
        '
        Me.ColumnNombre.HeaderText = "Nombre del Vendedor"
        Me.ColumnNombre.Name = "ColumnNombre"
        '
        'ColumnVentas
        '
        Me.ColumnVentas.HeaderText = "Total de Ventas"
        Me.ColumnVentas.Name = "ColumnVentas"
        '
        'ColumnComision
        '
        Me.ColumnComision.HeaderText = "% Comisión"
        Me.ColumnComision.Name = "ColumnComision"
        '
        'ColumnImporte
        '
        Me.ColumnImporte.HeaderText = "Importe Comisión"
        Me.ColumnImporte.Name = "ColumnImporte"
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(405, 295)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 1
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Comiciones
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(494, 330)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.Grilla)
        Me.Name = "Comiciones"
        Me.Text = "Comiciones que se pagan por vendedor"
        CType(Me.Grilla, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents Grilla As System.Windows.Forms.DataGridView
    Friend WithEvents btnSalir As System.Windows.Forms.Button
    Friend WithEvents ColumnNombre As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents ColumnVentas As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents ColumnComision As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents ColumnImporte As System.Windows.Forms.DataGridViewTextBoxColumn
End Class
