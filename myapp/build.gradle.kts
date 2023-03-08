
plugins {
    `cpp-application` // <1>

    `cpp-unit-test` // <2>
}

application { // <3>
    targetMachines.set(listOf(machines.linux.x86_64, machines.windows.x86_64))
    dependencies {
        implementation(project(":mylibrary"))
    }
}
