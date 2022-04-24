$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "TF login functionality test",
  "description": "",
  "id": "tf-login-functionality-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2037951399,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#@Rango2"
    }
  ],
  "line": 3,
  "name": "1 User should be able to login with valid credentials",
  "description": "",
  "id": "tf-login-functionality-test;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should land on Dashb oard page",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step_definition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 858221500,
  "status": "passed"
});
formatter.match({
  "location": "login_step_definition.user_enters_password()"
});
formatter.result({
  "duration": 96256700,
  "status": "passed"
});
formatter.match({
  "location": "login_step_definition.user_enters_username()"
});
formatter.result({
  "duration": 98924899,
  "status": "passed"
});
formatter.match({
  "location": "login_step_definition.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 2024939100,
  "status": "passed"
});
formatter.match({
  "location": "login_step_definition.user_should_land_on_Dashb_oard_page()"
});
formatter.result({
  "duration": 7310500,
  "status": "passed"
});
});