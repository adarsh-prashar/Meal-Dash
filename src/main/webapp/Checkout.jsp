<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style/Checkout.css"> 
</head>
<body>
    <div class="container">
        <div class="step-box">
            <div class="step-header">
                <div class="step-number">1</div>
                <div class="step-title">Delivery Address</div>
            </div>
            <div class="step-content">
                <div class="input-group">
                    <label class="input-label">Complete Address</label>
                    <input type="text" class="input-field" placeholder="House/Flat No., Building, Street">
                </div>
                <div class="input-group">
                    <label class="input-label">Landmark</label>
                    <input type="text" class="input-field" placeholder="Nearby landmark (optional)">
                </div>
                <div class="input-group">
                    <label class="input-label">City</label>
                    <input type="text" class="input-field" placeholder="Enter city">
                </div>
            </div>
        </div>

        <div class="step-box">
            <div class="step-header">
                <div class="step-number">2</div>
                <div class="step-title">Payment</div>
            </div>
            <div class="step-content">
                <div class="input-group">
                    <label class="input-label">Payment Method</label>
                    <select id="payment-method" class="input-field">
                        <option value="">Select Payment Method</option>
                        <option value="card">Credit/Debit Card</option>
                        <option value="cod">Cash on Delivery</option>
                    </select>
                </div>

                <div id="payment-details" class="payment-details">
                    <div class="card-fields">
                        <div class="input-group">
                            <label class="input-label">Card Number</label>
                            <input type="text" class="input-field" placeholder="Enter card number">
                        </div>
                        <div class="input-group">
                            <label class="input-label">Expiry Date</label>
                            <input type="text" class="input-field" placeholder="MM/YY">
                        </div>
                        <div class="input-group">
                            <label class="input-label">CVV</label>
                            <input type="text" class="input-field" placeholder="Enter CVV">
                        </div>
                        <div class="input-group">
                            <label class="input-label">Cardholder Name</label>
                            <input type="text" class="input-field" placeholder="Enter cardholder name">
                        </div>
                    </div>

                    <div class="cod-fields">
                        <div class="input-group">
                            <label class="input-label">Alternate Phone Number</label>
                            <input type="text" class="input-field" placeholder="Enter alternate number">
                        </div>
                   <form action="Congratulations.jsp">
                    </div>
                    <button class="proceed-btn" id="proceed-btn" style="display:none;">Proceed to Pay</button>
                </div>
                   </form>
            </div>
        </div>
    </div>

    <script>
        document.getElementById("payment-method").addEventListener("change", function() {
            const paymentMethod = this.value;
            const paymentDetails = document.getElementById("payment-details");
            const cardFields = document.querySelector(".card-fields");
            const codFields = document.querySelector(".cod-fields");
            const proceedBtn = document.getElementById("proceed-btn");

            paymentDetails.style.display = "block";
            cardFields.style.display = "none";
            codFields.style.display = "none";
            proceedBtn.style.display = "none";

            if (paymentMethod === "card") {
                cardFields.style.display = "block";
                proceedBtn.style.display = "block";
            } else if (paymentMethod === "cod") {
                codFields.style.display = "block";
                proceedBtn.style.display = "block";
            }
        });
    </script>
</body>
</html>
