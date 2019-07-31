pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Code analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean compile sonar:sonar -Dsonar.java.binaries=./target'
        }
      }
    }
  }
}
