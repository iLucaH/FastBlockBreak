# FastBlockBreak [![](https://jitpack.io/v/iLucaH/FastBlockBreak.svg)](https://jitpack.io/#iLucaH/FastBlockBreak)
Break blocks faster than spigot/bukkit allows

**Maven:**
```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	<dependency>
	    <groupId>com.github.iLucaH</groupId>
	    <artifactId>FastBlockBreak</artifactId>
	    <version>1.0.4</version>
	</dependency>
  ```
**Gradle:**
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        implementation 'com.github.iLucaH:FastBlockBreak:Tag'
	}
```

Visit the jitpack repository for more information: [![](https://jitpack.io/v/iLucaH/FastBlockBreak.svg)](https://jitpack.io/#iLucaH/FastBlockBreak)


__***~~------------------------------------------------------------------------------------------------------------------------------------------~~***__

# How to use

**You can utilize the BlockHandler class like this;**
```java
    private final BlockHandler blockHandler = new BlockHandler();
    
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        blockHandler.setBlockFast(location, material, applyPhysics);
    }
```
**Or alternatively you can use the FastBlockBreak static method like this;**
```java
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        FastBlockBreak.getBlockHandler().setBlockFast(location, material, applyPhysics);
    }
```
