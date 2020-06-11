<!--docs:
title: "Material progress indicators"
layout: detail
section: components
excerpt: "Progress indicators express an unspecified wait time or display the length of a process."
iconId: 
path: /catalog/material-progress-indicators/
-->

# Progress indicators

[Progress indicators](https://material.io/components/progress-indicators) express an unspecified wait time or display the length of a process.


![Progress indicator hero](assets/hero-1.gif)

# Contents

* [Using progress indicators](#using-progress-indicators)
* [Installing progress indicators](#installing-progress-indicators)
* [Making progress indicators accessible](#making-progress-indicators-accessible)
* [Linear progress indicators](#linear-progress-indicators)
* [Circular progress indicators](#circular-progress-indicators)
* [Theming progress indicators](#theming-progress-indicators)

## Using progress indicators

Progress indicators inform users about the status of ongoing processes, such as loading an app, submitting a form, or saving updates. They communicate an app’s state and indicate available actions, such as whether users can navigate away from the current screen.



_**Note: When displaying progress for a sequence of processes, indicate overall progress rather than the progress of each activity.**_

### Installing progress indicators

### Making progress indicators accessible

## Types

Material Design offers two visually distinct types of progress indicators:  1. [linear](#linear-progress-indicators) 2. [circular](#circular-progress-indicators) progress indicators. Only one type should represent each kind of activity in an app. For example, if a refresh action displays a circular indicator on one screen, that same action shouldn’t use a linear indicator elsewhere in the app.

![Composite image of progress indicator types](assets/composite-1.gif)

## Linear progress indicators

Linear progress indicators display progress by animating an indicator along the length of a fixed, visible track. The behavior of the indicator is dependent on whether the progress of a process is known.


Linear progress indicators support both determinate and indeterminate operations.
* Determinate operations display the indicator increasing in width from 0 to 100% of the track, in sync with the process’s progress.
* Indeterminate operations display the indicator continually growing and shrinking along the track until the process is complete.


### Installing linear progress indicators

1. Install with CocoaPods

    Add the following to your Podfile:
    ```
    pod 'MaterialComponents/ProgressView'
    ```

    Then, run the following command:
    ```
    pod install
    ```
1. Import the `ActivityIndicator`

    <!--<div class="material-code-render" markdown="1">-->

    #### Objective-C
    ```objc
    #import "MaterialProgressView.h"
    ```
    #### Swift
    ```swift
    import MaterialComponents.MaterialProgressView
    ```
    <!--</div>-->


### Making linear progress indicators accessible

**Note to developers: List/describe any accessibility settings or attributes associated with `ProgressView`**



### Linear progress indicator example


`ProgressView`
* [Class definition](https://material.io/components/ios/catalog/progress-indicators/progress-views/api-docs/Classes/MDCProgressView.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/ProgressView)

The following example shows an indeterminate linear progress indicator:

**Note to developers: Generate code/screenshot of the following**
* Create an indeterminate linear progress indicator



## Anatomy and key properties

The following is an anatomy diagram of a linear progress indicator:

![Linear progress indicator anatomy](assets/LinearProgress_anatomy.png)

A linear progress indicator consists of the following:
1. Track
2. Indicator

### Linear track
The track is a fixed width rule, with set boundaries for the indicator to travel along.

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |

### Linear indicator
The indicator animates along the length of the track.

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |

## Circular progress indicators

Circular progress indicators display progress by animating an indicator along an invisible circular track in a clockwise direction. They can be applied directly to a surface, such as a button or card.


Circular progress indicators support both determinate and indeterminate processes.
* Determinate circular indicators fill the invisible, circular track with color, as the indicator moves from 0 to 360 degrees.
* Indeterminate circular indicators grow and shrink in size while moving along the invisible track.

![Circular progress indicator](insert circular progress indicator static image)

### Installing circular progress indicators

1. Install with CocoaPods

    Add the following to your Podfile:
    ```
    pod 'MaterialComponents/ActivityIndicator'
    ```

    Then, run the following command:
    ```
    pod install
    ```
1. Import the `ActivityIndicator`

    <!--<div class="material-code-render" markdown="1">-->

    #### Objective-C
    ```objc
    #import "MaterialActivityIndicator.h"
    ```
    #### Swift
    ```swift
    import MaterialComponents.MaterialActivityIndicator
    ```
    <!--</div>-->


### Making circular progress indicators accessible

**Note to developers: List/describe any accessibility settings or attributes associated with `ActivityIndicator`**



### Circular progress indicator example


`ActivityIndicator`
* [Class definition](https://material.io/develop/ios/components/progress-indicators/activity-indicators/api-docs/Classes/MDCActivityIndicator.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/ActivityIndicator)

The following shows a determinate circular progress indicator

**Note to developers: Generate code/screenshot of the following**
* A determinate circular progress indicator

## Theming progress indicators

`ProgressView`
* [Class definition](https://material.io/components/ios/catalog/progress-indicators/progress-views/api-docs/Classes/MDCProgressView.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/ProgressView)

`ActivityIndicator`
* [Class definition](https://material.io/develop/ios/components/progress-indicators/activity-indicators/api-docs/Classes/MDCActivityIndicator.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/ActivityIndicator)


The following shows an indeterminate linear progress indicator and a determinate circular progress indicator with [Shrine theming](https://material.io/design/material-studies/shrine.html):

**Note to developers: Generate two separate code examples and screenshots of the following using [Shrine theming](https://material.io/design/material-studies/shrine.html)**
* Create an indeterminate linear progress indicator
* A determinate circular progress indicator

