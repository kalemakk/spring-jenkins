pipeline {
    agent { 
        node {
            label 'local'
            }
      }
    stages {
        stage('Get Source Code') {
            steps {
               timestamp{
                git branch: 'main', credentialsId: 'machine1', url: 'git@github.com:kalemakk/spring-jenkins.git'
               }
            }
        }
        stage('Show Source Code') {
            steps {
             timestamp{
                ls -ltr
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