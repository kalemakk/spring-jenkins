pipeline {
    agent { 
        node {
            label 'local'
            }
      }
    stages {
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
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}