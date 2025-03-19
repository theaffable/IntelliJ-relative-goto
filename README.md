<h1 style="text-align: center">
Relative Goto
</h1>
<h3 style="text-align: center">
Relative Goto plugin for IntelliJ-based IDEs    
</h3>

### Introduction
Jump to line relative to your caret position, instead of absolute line value

### Installation
The plugin is not yet released on Jetbrains Marketplace.
To install it build it first, then navigate to
`Plugins > click the cogwheel > Intstall plugin from disk` and select the zip file located in `build > distributions`

### Usage
There are two distinct actions available: one for moving up and another for moving down. 
However, both actions can accept negative line values. This means you can use the "Jump Up" action and provide a negative line value to move down instead.

### Default keyboard shortcuts
MacOS:
 - Jump up: ⌥ + ;
 - Jump down: ⌥ + '

Windows/Unix:
- Jump up: Alt + ;
- Jump down: Alt + '

This specific shortcuts are best used together with [IJKL navigation](https://plugins.jetbrains.com/plugin/9852-ijkl-shortcuts) but can be modified in IntelliJ settings

### Building the project
`./gradlew buildPlugin`