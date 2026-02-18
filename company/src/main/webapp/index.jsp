

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login-Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-  sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
            <style>
                body {
                    background: black;
                    height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    font-family: Arial, sans-serif;
                }

                .company {
                    background-color: white;
                    padding: 20px;
                    width: 100%;
                    max-width: 500px;
                    border-radius: 12px;
                    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
                }

                #heading {
                    text-align: center;
                    margin-bottom: 25px;
                    font-weight: bold;
                    color: #333;
                }

                .form-control {
                    border-radius: 8px;
                }

                .form-control:focus {
                    box-shadow: 0 0 5px rgba(102, 126, 234, 0.6);
                    border-color: #667eea;
                }

                .btn-primary {
                    width: 100%;
                    border-radius: 8px;
                    background-color: #667eea;
                    border: none;
                    padding: 10px;
                    font-weight: 600;
                }

                .btn-primary:hover {
                    background-color: #5a67d8;
                }
            </style>

</head>
<body>
 <form action="loginPage" method="post">

    <%@ page isELIgnored="false" %>

    <h2 style="color:${color}; text-align:center;">
        ${message}
    </h2>

    <div class="company">
        <h1 id="heading">Company Registration Form</h1>

            <div class="mb-3">
                <label class="form-label">First Name</label>
                <input type="text" class="form-control" placeholder="Enter First Name" name="firstName">
            </div>

            <div class="mb-3">
                <label class="form-label">Last Name</label>
                <input type="text" class="form-control" placeholder="Enter Last Name" name="lastName">
            </div>


            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Email-Id" aria-describedby="emailHelp" name="email">
            </div>

            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Enter password" name="password">
            </div>



            <div class="mb-3">
                <label class="form-label">Company Name</label>
                <input type="text" class="form-control" placeholder="Enter previous Company name" name="companyName">
            </div>



            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile Number</label>
                <input type="tel" class="form-control" id="mobile" placeholder="Enter your mobile number" name="mobileNumber">
            </div>


            <button type="submit" class="btn btn-primary">Submit</button>
        </form>


        <button type="button"><a href="data">Read Data</button>
    </div>
</body>
</html>
