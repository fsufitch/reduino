package mc.reduino

interface LoaderPlatform {
    val name: String

    fun onLoaderPlatformLoaded()
}