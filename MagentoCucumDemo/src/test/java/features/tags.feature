Feature: Gmail testing

@SmokeTest @SystemTest @FunctionalTest
Scenario: test login with valid credentials
Given valid login

@FunctionalTest
Scenario: test login with invalid credentials
Given invalid login

@FunctionalTest
Scenario: test forget password link
Given forget password click

@FunctionalTest
Scenario: test learnmore link
Given learnmore click

@FunctionalTest
Scenario: test create account link
Given create account click

@SystemTest @RegressionTest @SmokeTest
Scenario: test inbox
Given valid login
Then check inbox

@RegressionTest
Scenario: test starred
Given valid login
Then check starred

@RegressionTest
Scenario: test important
Given valid login
Then check important

@RegressionTest
Scenario: test spam
Given valid login
Then check spam

@RegressionTest
Scenario: test trash
Given valid login
Then check trash

@RegressionTest @SmokeTest
Scenario: test compose
Given valid login
Then check compose

@RegressionTest @SmokeTest
Scenario: test sentitems
Given valid login
Then check sentitems

@RegressionTest
Scenario: test outbox
Given valid login
Then check outbox

@SmokeTest @SystemTest @FunctionalTest
Scenario: test logout
Given valid login
Then check logout