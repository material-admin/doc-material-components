<!--docs:
title: "Floating action button"
layout: detail
section: components
excerpt: "A floating action button (FAB) represents the primary action of a screen."
iconId: 
path: /catalog/floating-action-button/
-->

# Floating action buttons

A floating action button (FAB) represents the primary action of a screen.

There are three types of FABS:

1. [Regular FABs](#regular-fabs)
2. [Mini FABs](#mini-fabs)
3. [Extended FABs](#extended-fabs)

![Regular FAB example](assets/FAB_types.png)

## Using FABs

A FAB performs the primary, or most common, action on a screen. It appears in front of all screen content, typically as a circular shape with an icon in its center. 

Before you can use Material buttons, you need to add a dependency to the
Material Components for Android library. For more information, go to the
[Getting started](/material-components/material-components-android/blob/master/docs/getting-started.md)
page.

### Making FABs accessible

FABs support content labeling for accessibility and are readable by most
screen readers, such as TalkBack. Text rendered in FABs is automatically
provided to accessibility services. Additional content labels are usually
unnecessary.

For more information on content labels, go to the
[Android accessibility help guide](https://support.google.com/accessibility/android/answer/7158690).


### Regular FABs

![Regular FAB example](assets/regular-FAB.png)

Regular FABs are FABs that are not expanded and are a regular size.

`FloatingActionButton`
* [Class description](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
* [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

**Note to developers: provide sample code and a screenshot of a regular FAB with a '+' icon**

### Anatomy and key properties

![Regular FAB anatomy diagram](assets/FAB_anatomy-long.png)

A regular FAB has a container and an icon.

1. Container
1. Icon


#### Container attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Color** | | |
**Stroke color** | | |
**Stroke width** | | |
**Shape** | | |
**Elevation** | | |
**Ripple color** | | |

#### Icon attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Icon** | | | 
**Color** | | |
**Size** | | |
**Gravity** | | |

#### Styles

&nbsp; | Style
---|---
**Default style** | 
**Icon style** | 

## Mini FABs

![Mini FAB example](assets/mini-FAB.png)

A mini FAB should be used on smaller screens.

Mini FABs can also be used to create visual continuity with other screen elements.

### Mini FABs example

`FloatingActionButton`
* [Class description](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
* [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

**Note to developers: provide sample code and a screenshot of a mini FAB with a '+' icon**
### Anatomy and key properties


![Mini FAB anatomy diagram](assets/miniFAB_anatomy-long.png)

A mini FAB has a container and an icon.


1. Container
1. Icon

#### Container attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Color** | | |
**Stroke color** | | |
**Stroke width** | | |
**Shape** | | |
**Elevation** | | |
**Ripple color** | | |

#### Icon attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Icon** | | | 
**Color** | | |
**Size** | | |
**Gravity** | | |

#### Styles

&nbsp; | Style
---|---
**Default style** | 
**Icon style** | 

## Extended FABs

![Extended FAB example](assets/extended-FAB.png)

The extended FAB is wider, and it includes a text label.

### Extended FABs example

`ExtendedFloatingActionButton`
* [Class description](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton)
* [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.java)

**Note to developers: provide sample code and a screenshot of an extended FAB with a '+' icon and the word "extended"**

### Anatomy and key properties

![Extended FAB anatomy diagram](assets/extended-FAB_anatomy-long.png)

An extended FAB has a text label, a transparent container and an optional icon.

1. Container
1. Icon
1. Text label


#### Container attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Color** | | |
**Stroke color** | | |
**Stroke width** | | |
**Shape** | | |
**Elevation** | | |
**Ripple color** | | |

#### Icon attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Icon** | | | 
**Color** | | |
**Size** | | |
**Gravity** | | |

#### Text label

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | | | 
**Color** | | |
**Typography** | | | 

#### Styles

&nbsp; | Style
---|---
**Default style** | 
**Icon style** | 


## Theming

### FAB theming example

API and source code:

* `FloatingActionButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)
* `ExtendedFloatingActionButton`
    * [Class description](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton)
    * [GitHub source](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.java)


**Note to developers: Provide sample code and a screenshot of a regular FAB, mini FAB, and extended FAB using the [Shrine](https://material.io/design/material-studies/shrine.html) theme**



