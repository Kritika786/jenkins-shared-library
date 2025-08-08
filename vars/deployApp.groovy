def call(String env = "dev") {
    echo "Deploying to ${env}..."
    sh "kubectl apply -f k8s/${env}/deployment.yaml"
}

