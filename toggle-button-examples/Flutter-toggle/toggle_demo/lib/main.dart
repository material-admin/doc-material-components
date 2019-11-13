import 'package:flutter/material.dart';

import 'toggle_icon_demo.dart';
import 'toggle_bar_demo.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Toggle Button Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: '/toggleIconPage',
      routes: {
        '/toggleBarPage': (context) => ToggleBarDemo(title: 'Toggle Bar Demo'),
        '/toggleIconPage': (context) => ToggleIconDemo(title: 'Toggle Icon Demo'),
        '/outlineButton'
      },
    );
  }
}





