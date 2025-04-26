package com.example.API_DEMO_1.Controller;

import org.springframework.web.bind.annotation.*;

//1Esta clase completa se va a manejar mediante protocolo http
@RestController

//2. Ruta base para acceder a  mi api
@RequestMapping("/api/vi/controlador")
public class OperacionesController {

        //3.Agregar un saludo de bienvenida
        @RequestMapping("/saludo")
        public String saludo(){
            return "Bienvenido a mi API DEMO1";
    }

        //4. Saludar recibiendo un parametro mediante la url
        @GetMapping("/hello/{nombre}")
        public String saludoDinamico(@PathVariable String nombre){
            return "hola a todos mi nombre es: " +nombre;
        }

        //5. Operaciones aritmeticas
        @GetMapping("/suma")
        public String suma(){
            int resultado = 5+3;
            return "El resultado de la suma es: " +resultado;
        }

        //6. Operaciones resta
        @GetMapping("/resta")
        public String resta() {
            int resultado = 5 - 3;
            return "El resultado de la suma es: " + resultado;
        }

        //7. Operaciones multiplicacion
        @GetMapping("/multiplicacion")
        public String multiplicacion() {
            int resultado = 5 * 3;
            return "El resultado de la suma es: " + resultado;
        }

        //8. Operaciones dividir
        @GetMapping("/dividir")
        public String dividir() {
            int resultado = 5 / 3;
            return "El resultado de la suma es: " + resultado;
        }

        //9. suma recibiendo parametros
        @GetMapping("/suma/{a}/{b}")
        public String sumaConParametros(@PathVariable int a, @PathVariable int b){
            return "El resultado de la suma" +a + "+" +b + "es: " +(a+b);
        }

        //10. resta recibiendo parametros
        @GetMapping("/resta/{a}/{b}")
        public String restaConParametros(@PathVariable int a, @PathVariable int b){
            return "El resultado de la resta" +a + "-" +b + "es: " +(a-b);
        }

        //11. multiplicacion recibiendo parametros
        @GetMapping("/multiplicacion/{a}/{b}")
        public String multiplicacionConParametros(@PathVariable int a, @PathVariable int b){
            return "El resultado de la multiplicacion" +a + "*" +b + "es: " +(a*b);
        }

        //12. division recibiendo parametros
        @GetMapping("/division/{a}/{b}")
        public String divisionConParametros(@PathVariable int a, @PathVariable int b){
            if (b==0){
                return "El resultado no se puede dividir por Zero";
            }
            return "El resultado de la division" +a + "/" +b + "es: " +(a/b);
        }

        //13. ejemplo de uso de encabezados HTTP para obtener informacion del cliente (navegador)
        @GetMapping("/uso-agente")
        public String obtenerInfoAgente(@RequestHeader(value = "User-Agent", defaultValue = "Desconocido") String userAgent){
            return "La informacion mediante la cabezera de head es: " +userAgent;
        }
    }
