Public Class Comiciones
    Dim i As Integer = 0 'variable de vendedor
    Dim j As Integer = 0 'variable de factura

    Private Sub ObtenerdatosGrilla() 'procedimiento privado del registro de todos los datos que van dentro de la grilla
        'acumula los datos en la grilla y calcula importe comision
        Do While i < IV
            Dim totalventas As Decimal = 0 'variable del total de ventas en valor decimal
            Dim importecomision As Decimal = 0 'variable del importe comision en valor decimal

            'acumula todas las facturas del vendedor correspondiente
            j = 0
            Do While j < IFAC
                If VVendedor(i).vendedor = VFactura(j).vendedorFactura Then
                    totalventas = totalventas + VFactura(j).importe
                End If
                j += 1
            Loop

            importecomision = Math.Round(totalventas * VVendedor(i).comision / 100, 2) 'calculo importe comision
            Grilla.Rows.Add(VVendedor(i).nombre, totalventas.ToString, VVendedor(i).comision.ToString, importecomision.ToString) 'añadir datos dentro de la grilla por filas
            i += 1 'incrementa la variable de vendedor en 1
        Loop

    End Sub

    Private Sub Comiciones_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load


        'calculo de el importe más la comision del vendedor
        'While j < IV And j < IFAC
        '    importe = Val(VFactura(j).importe)
        '    comision = Val(VVendedor(j).comision)
        '    totalventas = (importe * comision) / 100
        '    j += 1
        'End While


        'Do While i < IV
        '    Dim totalventas As Decimal = 0
        '    Dim importecomision As Decimal = 0
        '    'acumula todas las facturas del vendedor correspondiente
        '    j = 0
        '    Do While j < IFAC
        '        If VVendedor(i).vendedor = VFactura(j).vendedor Then
        '            totalventas = totalventas + VFactura(j).importe
        '        End If
        '        j += 1
        '    Loop

        '    importecomision = Math.Round(totalventas * VVendedor(i).comision / 100, 2)
        '    Grilla.Rows.Clear()
        '    Grilla.Rows.Add(VVendedor(i).nombre, totalventas.ToString, VVendedor(i).comision.ToString, importecomision.ToString)
        '    i += 1
        'Loop
        ''ingreso de datos en las filas de la grilla
        'Grilla.Rows.Clear()
        'While i < IV
        '    While j < IFAC

        '        i += 1
        '    End While
        'End While

        ObtenerdatosGrilla() 'se obtinen los registros dentro de la grilla

    End Sub

    Private Sub btnSalir_Click(sender As System.Object, e As System.EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub
End Class