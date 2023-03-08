
plugins {
    `cpp-library`
    `cpp-unit-test`
}

library {
    targetMachines.set(listOf(machines.linux.x86_64, machines.windows.x86_64))
    linkage.set(listOf(Linkage.STATIC, Linkage.SHARED))
}
