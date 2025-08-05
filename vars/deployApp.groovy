def call(String env = "dev") {
    pipeline {
        agent any
        stages {
            stage('Deploy') {
                steps {
                    echo "Deploying to ${env}..."
                    sh "kubectl apply -f k8s/${env}/deployment.yaml"
                }
            }
        }
    }
}
