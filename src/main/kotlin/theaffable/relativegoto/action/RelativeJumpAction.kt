package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import theaffable.relativegoto.dialog.RelativeJumpDialog

class RelativeJumpAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        RelativeJumpDialog().showAndGet()
    }
}