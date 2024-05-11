pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage('Report') {
            steps {
                echo 'Generating report...'
                sh 'mvn serenity:aggregate'
                archiveArtifacts artifacts: 'target/site/serenity/*', fingerprint: true
            }
        }
    }
}