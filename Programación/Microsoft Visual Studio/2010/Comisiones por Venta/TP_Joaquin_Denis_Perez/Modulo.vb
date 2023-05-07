Module Modulo

    Public VVendedor(9) As Vendedor 'array vendedores publica
    Public IV As Integer = 0 'Definir indice de vendedores publico
    'variables para el array de registro de nuevo vendedor
    Public Structure Vendedor
        Public vendedor As Integer
        Public nombre As String
        Public comision As Decimal
    End Structure

    Public VFactura(99) As Factura 'array factura publica
    Public IFAC As Integer = 0 'Definir indice de vendedores publico
    'variables para el array de registro de las facturas
    Public Structure Factura
        Public factura As Integer
        Public fecha As DateTime
        Public vendedorFactura As Integer
        Public importe As Integer
    End Structure
End Module
