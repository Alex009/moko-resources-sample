//
//  MainViewController.swift
//  iosApp
//
//  Created by Aleksey Mikhailov on 08.07.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import UIKit
import shared

class MainViewController: UIViewController {

    @IBOutlet private var greetingLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        greetingLabel.text = SharedData.shared.greeting.localized()
    }
}
