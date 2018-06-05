package com.automatizador.demo;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/simulador_credito_consumo.feature",
        glue = { "bancolombia.definitions"}
)
public class Login {
}
