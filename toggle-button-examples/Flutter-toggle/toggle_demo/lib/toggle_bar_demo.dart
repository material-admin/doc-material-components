import 'package:flutter/material.dart';

class ToggleBarDemo extends StatefulWidget {
  ToggleBarDemo({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _ToggleBarDemoState createState() => _ToggleBarDemoState();
}

class _ToggleBarDemoState extends State<ToggleBarDemo> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        actions: [
          IconButton(
              icon: const Icon(Icons.pages),
              tooltip: 'Change Page',
              onPressed: changePage
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            buildIconButton(),
          ],
        ),
      ),
    );
  }

  /// The Routes were set in the main.dart. Navigator is a tool that lets you
  /// access these different routes.
  void changePage(){
    Navigator.of(context).pushReplacementNamed('/toggleIconPage');
  }

  bool iconButtonToggle = false;

  Widget buildIconButton() {
    return Align(
      alignment: const Alignment(0.0, -0.2),
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: <Widget>[
          iconWidget(Icons.aspect_ratio, 'Aspect Ratio'),
          iconWidget(Icons.assignment_ind, 'Assignment Ind'),
          iconWidget(Icons.assignment_late, 'Assignment Late'),
          iconWidget(Icons.bookmark_border, 'Bookmark Border'),
        ].map<Widget>((Widget button) =>
            SizedBox(width: 64.0, height: 64.0, child: button)).toList(),
      ),
    );
  }
  /// [iconWidget] is a class that allows the icon to toggle between on and off.
  IconButton iconWidget(IconData iconData, String semanticLabel) {
    return IconButton(
      icon: Icon(
        iconData,
        semanticLabel: semanticLabel,
      ),
      onPressed: () {
        setState(() => iconButtonToggle = !iconButtonToggle);
      },
      color: iconButtonToggle ? Theme.of(context).primaryColor : null,
    );

  }
}