pipeline {
  agent any
  stages {
    stage('Code analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean sonar:sonar'
        }
      }
    }
  }
}
