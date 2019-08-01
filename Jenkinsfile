pipeline {
  agent any
  stages {
    stage('Code analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean package -e sonar:sonar -Dsonar.java.binaries=./target'
        }

      }
    }
  }
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
}