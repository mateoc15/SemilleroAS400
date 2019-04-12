$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BuscarEnGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Arthur am on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinition.arthur_am_on_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinition.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He validates that the result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinition.he_validates_that_the_result_is_success()"
});
formatter.result({
  "status": "passed"
});
});