pipeline {
    agent { 
        node {
            label 'local'
            }
      }
    tools {
        maven "MAVEN"
    }
    stages {
        stage('Initialize'){
            steps{
                timestamps{
                    echo "PATH = ${M2_HOME}/bin:${PATH}"
                    echo "M2_HOME = /opt/maven"
                }
            }
        }
        stage('Get Source Code') {
            steps {
               timestamps{
                git branch: 'main', credentialsId: 'machine1', url: 'git@github.com:kalemakk/spring-jenkins.git'
               }
            }
        }
        stage('Show Source Code') {
            steps {
             timestamps{
                sh 'ls -ltr'
             }
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean package'
            }
        }
        stage('RUN') {
            steps {
                sh 'ls -ltr'
            }
        }
    }
}