def call () {
    deploy adapters: [tomcat9(credentialsId: 'tomcat-cred', path: '', url: 'http://54.146.92.27:8080/')], contextPath: 'Planview', onFailure: false, war: 'target/*.war'   
}
