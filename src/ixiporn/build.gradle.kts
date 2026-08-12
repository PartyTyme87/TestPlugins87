plugins {
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    // This must match your exact Plugin class name
    setPlugin("com.PartyTyme87.ixiporn.ixipornProvider") 
    name = "Ixiporn"
    description = "My custom extension"
    authors.add("PartyTyme87")
    versionName = "1.0.0"
    versionCode = 1
}
