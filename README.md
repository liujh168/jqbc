中国象棋盲棋训练软件系统设计与实现
1背景与目的
2功能需求
3 Android开发环境配置
3.1 安装JDK.
3.2 安装SDK.
3.3 Android Studio安装配置
3.4 Android版本配置
4功能设计与实现
4.1 Android系统组件使用情况
4.2 主要功能类介绍
5改进和优化

1 背景与目的
作为资深中国象棋爱好者，日常娱乐中对象棋盲棋对弈与训练有过一些经验体会，一直想开发一款能在智能手机上运行的中国象棋盲棋训练软件，方便象棋大师级选手和业余爱好者进行日常盲棋训练。本软件系统计划在作者进行盲棋训练的经验体会和实际需求分析的基础上，确定系统的功能和性能要求，对软件系统的用户界面、布局算法、音效和动画等进行了设计，实现一个界面友好、方便高效的Android智能手机盲棋训练软件系统。本系统开发的的目的，一方面是为了进一步学习掌握Android手机移动应用开发技术（包括涉及到的服务器应用相关技术），另一方面，为中国象棋盲棋爱好者进行日常盲棋训练提供一些方便与帮助。

2功能需求
中国象棋棋盘显示隐藏及与用户交互，实现棋盘棋子基本界面视图。
自由设置盲棋训练的盘数，为初学盲棋者至高手提供数量不等的训练环境。
己方棋步输入方式，主要利用语音识别获得口头输入，辅之以文本、屏幕点击等其它输入方式，用户可根据自己的喜好自由选择。
对方棋步获得方式，利用本地或者远程中国象棋UCCI引擎输出棋步，输出方式为棋步的语音合成（电脑方或远程对手棋步的语音播报），辅之以文本显示为补充手段。
用户可根据自己的喜好自由选择电脑方或远程对手。

3 Android开发环境配置
本系统在Windows 7操作系统 Android Studio开发环境下设计实现，涉及到的主要软件组合如下：JDK、Android SDK、Gradle及Android模拟器。以下是简单的安装设置步骤（用于备忘）：
3.1 安装JDK
3.2 安装SDK
3.3 Android Studio安装配置
3.4 Android版本配置

4功能设计与实现
4.1 Android系统组件使用情况
4.2 主要功能类介绍
1.Controller
2.Views
3.Modules

5改进与优化
训练进度储存与恢复。
通过Android NDK套件，使用相对熟悉的C/C++实现算法优化、改进与提高电脑选手的棋力。
利用云服务器，增加远程盲棋对弈功能（1 vs N），训练之余增加娱乐性与提高实战对弈能力。
利用深度学习算法训练自己的语音识别系统，减少外界依赖（这个技术有点难，学习中）。

有兴趣者加入者，到这里看看。
