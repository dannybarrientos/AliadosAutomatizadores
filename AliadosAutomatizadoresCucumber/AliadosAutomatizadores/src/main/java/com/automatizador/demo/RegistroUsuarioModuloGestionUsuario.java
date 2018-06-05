package com.automatizador.demo;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_usuario_modulo_gestion_usuario.feature",
        glue = { "bancolombia.definitions"}
)
public class RegistroUsuarioModuloGestionUsuario {
}
