package br.faccat.clinica_selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AgendamentoSeleniumTest {

    private WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); // Altere aqui
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void deveAgendarConsultaViaInterface() {
        driver.get("http://localhost:8080/agendar.html");

        driver.findElement(By.id("paciente")).sendKeys("Laura");
        driver.findElement(By.id("datahora")).sendKeys("2025-07-01T14:00");
        driver.findElement(By.tagName("button")).click();

        String msg = driver.findElement(By.id("mensagem")).getText();
        assertEquals("Consulta agendada para Laura em 2025-07-01T14:00", msg);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

