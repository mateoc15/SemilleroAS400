$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/features/GoogleSearchWithData.feature");
formatter.feature({
  "name": "Buscar en google con datos desde el feature",
  "description": "  Arthur quiere hacer una busqueda en google con datos",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buscaar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio de google",
  "keyword": "Given "
});
formatter.step({
  "name": "cuando el busca la frase \"\u003cpalabra\u003e\" compuesta \"\u003cpalabrados\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "El verifica que la palabra \"\u003cpalabra\u003e\" este en los resultado",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabrados"
      ]
    },
    {
      "cells": [
        "shopos",
        "uno"
      ]
    },
    {
      "cells": [
        "switch",
        "dos"
      ]
    },
    {
      "cells": [
        "jgkjjj",
        "tres"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscaar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.arthurEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cuando el busca la frase \"shopos\" compuesta \"uno\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.cuandoElBuscaLaFraseCompuesta(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"shopos\" este en los resultado",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscaar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.arthurEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cuando el busca la frase \"switch\" compuesta \"dos\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.cuandoElBuscaLaFraseCompuesta(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"switch\" este en los resultado",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscaar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "arthur esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.arthurEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cuando el busca la frase \"jgkjjj\" compuesta \"tres\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.cuandoElBuscaLaFraseCompuesta(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El verifica que la palabra \"jgkjjj\" este en los resultado",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});