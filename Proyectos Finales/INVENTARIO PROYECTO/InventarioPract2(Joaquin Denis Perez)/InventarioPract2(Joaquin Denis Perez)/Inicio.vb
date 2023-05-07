Public Class Inicio
    Private Sub btnInciar_Click(sender As Object, e As EventArgs) Handles btnInciar.Click
        Dim m As New Menu 'declarar el formulario Menu como objeto para reconocerlo

        If txtUser.Text = "" Or txtPassword.Text = "" Then
            MessageBox.Show("No se Ingresaron Datos", "ERROR")

        ElseIf txtUser.Text = "joaquin" And txtPassword.Text = "1234" Then
            m.Show()
            Me.Hide()
        Else
            MessageBox.Show("El Usuario o la Contraseña son Incorrectos", "ERROR")

        End If
    End Sub
    Private Sub Inicio_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub txtUser_TextChanged(sender As Object, e As EventArgs) Handles txtUser.TextChanged

    End Sub

    Private Sub txtPassword_TextChanged(sender As Object, e As EventArgs) Handles txtPassword.TextChanged

    End Sub
End Class