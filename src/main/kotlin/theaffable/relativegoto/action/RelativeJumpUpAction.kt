package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import theaffable.relativegoto.dialog.RelativeJumpDialog
import theaffable.relativegoto.service.JumpDirection

class RelativeJumpUpAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        RelativeJumpDialog(JumpDirection.UP).show()
    }
}