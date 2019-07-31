pipeline {
  agent any
  stages {
    stage('Code analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean compile -e sonar:sonar -Dsonar.java.binaries=./target'
        }

      }
    }
  }
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
}