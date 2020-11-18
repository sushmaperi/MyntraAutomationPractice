$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Shopping.features");
formatter.feature({
  "line": 1,
  "name": "Online Shopping Features",
  "description": "",
  "id": "online-shopping-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Purchasing Boys T-shirts",
  "description": "",
  "id": "online-shopping-features;purchasing-boys-t-shirts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on shopping Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user selects categories",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user selects age",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_shopping_Page()"
});
formatter.result({
  "duration": 10310361400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_categories()"
});
formatter.result({
  "duration": 3411666400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_age()"
});
formatter.result({
  "duration": 448393800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_product()"
});
formatter.result({
  "duration": 995889600,
  "status": "passed"
});
});