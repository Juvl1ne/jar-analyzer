package me.n1ar4.jar.analyzer.gui.action;

import me.n1ar4.jar.analyzer.gui.MainForm;
import me.n1ar4.jar.analyzer.plugins.chatgpt.ChatGPTForm;
import me.n1ar4.jar.analyzer.plugins.encoder.EncodeUtilForm;
import me.n1ar4.jar.analyzer.plugins.listener.ListenUtilForm;
import me.n1ar4.jar.analyzer.plugins.repeater.HttpUtilForm;
import me.n1ar4.jar.analyzer.plugins.sqlite.SQLiteForm;

public class PluginsAction {
    public static void run() {
        MainForm.getInstance().getGptButton().addActionListener(e -> ChatGPTForm.start());

        MainForm.getInstance().getSqliteButton().addActionListener(e -> SQLiteForm.start());

        MainForm.getInstance().getEncoderBtn().addActionListener(e -> EncodeUtilForm.start());

        MainForm.getInstance().getRepeaterBtn().addActionListener(e -> HttpUtilForm.start());

        MainForm.getInstance().getListenerBtn().addActionListener(e -> ListenUtilForm.start());
    }
}
