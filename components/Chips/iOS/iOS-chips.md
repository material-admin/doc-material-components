<!--docs:
title: "Material chips"
layout: detail
section: components
excerpt: "Chips are compact elements that represent an input, attribute, or action."
iconId: 
path: /catalog/material-chips/
-->

# Chips

[Chips](https://material.io/components/chips) are compact elements that represent an input, attribute, or action.

![Hero image of an input chip](assets/chips-hero.png)

## Contents

* [Using chips](#using-chips)
* [Installing chips](#installing-chips)
* [Making chips accessible](#making-chips-accessible)
* [Input chips](#input-chips)
* [Choice chips](#choice-chips)
* [Filter chips](#filter-chips)
* [Action chips](#action-chips)
* [Theming](#theming)

## Using chips

Chips allow users to enter information, make selections, filter content, or trigger actions. While buttons are expected to appear consistently and with familiar calls to action, chips should appear dynamically as a group of multiple interactive elements.

### Installing chips

1. Install with CocoaPods
    Add the following to your Podfile:
    ```
    pod 'MaterialComponents/Chips'
    ```

    <!--{: .code-renderer.code-renderer--install }-->
    Run the installer:
    ```
    pod install
    ```
1. Import the `NavigationDrawer`

    <!--<div class="material-code-render" markdown="1">-->

    #### Objective-C
    ```objc
    #import "MaterialChips.h"
    ```
    #### Swift
    ```swift
    import MaterialComponents.MaterialChips
    ```
    <!--</div>-->



### Making chips accessible


**Note to developers: List/describe any accessibility settings or attributes associated with chips**


## Anatomy and key properties

The following is an anatomy diagram of a chip:

![Chip anatomy diagram](assets/chips-anatomy.png)

1. Container
1. Thumbnail (optional)
1. Text
1. Remove icon (optional)

### Container

| &nbsp; | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

### Thumbnail

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |

### Text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |


### Remove icon

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |

## Types

There are four different types of chips, including [input](#input-chips), [choice](#choice-chips), [filter](#filter-chips), and [action](#action-chips).

![Examples of the four different chip types](assets/chip composite image here)

### Input chips

Input chips represent a complex piece of information in compact form, such as an entity (person, place, or thing) or text. They enable user input and verify that input by converting text into chips.

#### Input chips example

`Chips`
* [Class definition](https://material.io/develop/ios/components/chips/api-docs/Classes/MDCChipCollectionViewCell.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Chips/src)

**Note to developers** Create an input chips example with the following features:

* Generate three chips; each chip has a "remove" icon and is labeled:
    * "Input 1"
    * "Input 2"
    * "Input 3"
* In the chips container, include an incomplete text entry for "Input 4"


### Choice chips

Choice chips allow selection of a single chip from a set of options.

Choice chips clearly delineate and display options in a compact area. They are a good alternative to toggle buttons, radio buttons, and single select menus.

#### Choice chips example
`Chips`
* [Class definition](https://material.io/develop/ios/components/chips/api-docs/Classes/MDCChipCollectionViewCell.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Chips/src)


**Note to developers** Create a choice chips example with the following features:

* Generate four choice chips labeled:
    * "Choice 1"
    * "Choice 2"
    * "Choice 3"
    * "Choice 4"
* Show a screenshot of "Choice 1" as selected

### Filter chips

Filter chips use tags or descriptive words to filter content.

Filter chips clearly delineate and display options in a compact area. They are a good alternative to toggle buttons or checkboxes.


#### Filter chips example

`Chips`
* [Class definition](https://material.io/develop/ios/components/chips/api-docs/Classes/MDCChipCollectionViewCell.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Chips/src)

**Note to developers** Create a filter chips example with the following features:

* Generate six filter chips, each labeled "Filter 1", "Filter 2" ... "Filter 6"
* Show a screenshot of "Filter 1" and "Filter 3" as selected with a check icon

### Action chips

Action chips offer actions related to primary content. They should appear dynamically and contextually in a UI.

An alternative to action chips are buttons, which should appear persistently and consistently.


#### Action chips example

`Chips`
* [Class definition](https://material.io/develop/ios/components/chips/api-docs/Classes/MDCChipCollectionViewCell.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Chips/src)


**Note to developers** Create an action chips example with the following features:

* Generate four actions chips, labeled:
    * "Action 1" with a favorites icon
    * "Action 2" with a trash icon
    * "Action 3" with an alarm icon
    * "Action 4" with a location icon


## Theming

Chips support [Material Theming](https://material.io/components/chips/#theming) and can be customized in terms of color, typography and shape.

### Theming example

**Note to developers** Create an input chips example with the following features using the [Shrine theme](https://material.io/design/material-studies/shrine.html):

* Generate three chips; each chip has a "remove" icon and is labeled:
    * "Input 1" with an "add\_shopping\_cart" icon
    * "Input 2" with a "card\_giftcard" icon
    * "Input 3" with a "credit\_card" icon
* In the chips container, include an incomplete text entry for "Input 4"


