package theaffable.relativegoto.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import org.jetbrains.plugins.notebooks.visualization.getAnyEditor
import theaffable.relativegoto.dialog.RelativeJumpDialog
import theaffable.relativegoto.service.JumpDirection
import theaffable.relativegoto.service.JumpService

class RelativeJumpDownAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        RelativeJumpDialog(
            direction = JumpDirection.DOWN,
            jumpService = JumpService(e.getData(CommonDataKeys.EDITOR)!!)
        ).show()
    }
}