#!/usr/bin/env groovy

def call(String buildResult) {
    
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "#3ED421", message: "Job:  with buildnumber  was successful @team_qa"
  }
  else if( buildResult == "FAILURE" ) {
    slackSend color: "#F92F03", message: "Job:  with buildnumber  was failed @team_devops @team_qa"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend color: "#FE9722", message: "Job:  with buildnumber  was unstable @team_devops @team_qa"
  }
  else {
    slackSend color: "#2222FE", message: "Job:  with buildnumber  its result was unclear @team_devops @team_qa" 
  }
  
}
