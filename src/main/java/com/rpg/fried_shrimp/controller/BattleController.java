package com.rpg.fried_shrimp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.rpg.fried_shrimp.model.Battle;


//@Controller
//@RequestMapping("/battle")
public interface BattleController {

     //final BattleService battleService;
     //final PlayerService playerService;
    
    // バトルスタート
    //@GetMapping("/battle")
    public String startBattle(Model model);
    
    // 結果表示
    //@PostMapping("/battle/result")
    public String battleResult(Battle battle, Model model) ;
    
    
    // 再挑戦用
    //@GetMapping("/battle/retry/{enemyId}")
    public String retryBattle(@PathVariable Long enemyId, Model model);
    
    // 次のバトルへ
    //@PostMapping("/battle/next")
    public String nextBattle();

    // あきらめる
    //@PostMapping("/battle/give_up")
    public String giveUp();
    
    // その他バトル関連のエンドポイントを実装
}
