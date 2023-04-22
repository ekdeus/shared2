def call(Map config = [:]) {
    sh "echo Hello Evgenii Kiselev ${config.name}. Today is ${config.dayOfWeek}."
}
