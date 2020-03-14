$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFileNew/Login.feature");
formatter.feature({
  "name": "AppAccess",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login to the Application",
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
  "name": "Browser Should be launched and URL should be opened",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.LaunchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter login Credentials UserName \"EM01\" Password \"sentrifugo\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.LoginOperation(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be Login and Dashboard Page should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.VerifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logout Test for Application",
  "description": "",
  "keyword": "Scenario",
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
  "name": "Application should be logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "LogoutTest.LogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on UserName and select Logout option",
  "keyword": "When "
});
formatter.match({
  "location": "LogoutTest.Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutTest.VerifyLogout()"
});
formatter.result({
  "status": "passed"
});
});